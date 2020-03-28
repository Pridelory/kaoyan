package com.course.kyapi.service;

import com.course.kyapi.ApiTestBase;
import com.course.modules.baidunetdisk.IDiskBasicService;
import com.course.modules.baidunetdisk.entity.File;
import com.course.modules.baidunetdisk.vo.queryvo.netdisk_basic_queryvo.FileListQueryVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * DiskBasic service测试
 */
public class DiskBasicTest extends ApiTestBase {

    @Autowired
    private IDiskBasicService diskBasic;

    private static final String access_token = "123.1281ca5a046f5fed5ff71cc29fddb36d.YloHy5V6hUuTuDvvIY1pFkC7mrHOjXyWaymYMWA.nqOMGw";

//    @Test
//    public void test_getDiskUserInfo() throws Exception {
//        UserInfo diskUserInfo = diskBasic.getDiskUserInfo(access_token);
//        System.out.println(diskUserInfo);
//    }
//
//    @Test
//    public void test_getNetDiskInfo() throws Exception {
//        NetDiskInfo netDiskInfo = diskBasic.getNetDiskInfo(access_token, null);
//        System.out.println(netDiskInfo);
//    }
//
    @Test
    public void test_getFileList() throws Exception {
        FileListQueryVO fileListQueryVO = new FileListQueryVO();
        fileListQueryVO.setDir("/电影");
        List<File> fileList = diskBasic.getFileList(access_token, fileListQueryVO);
        System.out.println(fileList);
    }
//
//    @Test
//    public void test_getFileListRecursively() throws Exception {
//        FileListRecursivelyQueryVO fileListRecursivelyQueryVO = new FileListRecursivelyQueryVO();
//        fileListRecursivelyQueryVO.setPath("/电影");
//        fileListRecursivelyQueryVO.setRecursion(1);
//        fileListRecursivelyQueryVO.setWeb(1);
//        List<File> fileList = diskBasic.getFileListRecursively(access_token, fileListRecursivelyQueryVO);
//        System.out.println(fileList);
//    }
//
//    @Test
//    public void test_getDocList() throws Exception {
//        DocListQueryVO docListQueryVO = new DocListQueryVO();
//        docListQueryVO.setNum(2);
//        List<File> docList = diskBasic.getDocList(access_token, docListQueryVO);
//        System.out.println(docList);
//    }
//
//    @Test
//    public void test_getPicList() throws Exception {
//        PicListQueryVO picListQueryVO = new PicListQueryVO();
//        picListQueryVO.setNum(1500);
//        List<File> picList = diskBasic.getPicList(access_token, picListQueryVO);
//        System.out.println(picList);
//    }
//
//    @Test
//    public void test_getVideoList() throws Exception {
//        VideoListQueryVO videoListQueryVO = new VideoListQueryVO();
//        videoListQueryVO.setNum(500);
//        List<File> videoList = diskBasic.getVideoList(access_token, videoListQueryVO);
//        System.out.println(videoList);
//    }

//    @Test
//    public void test_searchFileList() throws Exception {
//        SearchFileQueryVO searchFileQueryVO = new SearchFileQueryVO();
//        searchFileQueryVO.setNum(500);
//        searchFileQueryVO.setKey("哈利");
////        searchFileQueryVO.setRecursion(1);
//        searchFileQueryVO.setDir("/电影");
//        List<File> fileList = diskBasic.searchFile(access_token, searchFileQueryVO);
//        System.out.println(fileList);
//    }

}

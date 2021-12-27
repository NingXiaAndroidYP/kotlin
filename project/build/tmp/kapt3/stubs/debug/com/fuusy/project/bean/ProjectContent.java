package com.fuusy.project.bean;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bS\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u00a2\u0006\u0002\u0010)J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\bH\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u001aH\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u001aH\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020#0\"H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0005H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\bH\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\bH\u00c6\u0003J\t\u0010o\u001a\u00020\u0005H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\u00d9\u0002\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010r\u001a\u00020\b2\b\u0010s\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010t\u001a\u00020\u0005H\u00d6\u0001J\t\u0010u\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010-R\u0011\u0010\u001d\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010BR\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010-R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010+R\u0011\u0010%\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010-R\u0011\u0010&\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010-R\u0011\u0010\'\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010-R\u0011\u0010(\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010-\u00a8\u0006v"}, d2 = {"Lcom/fuusy/project/bean/ProjectContent;", "", "apkLink", "", "audit", "", "author", "canEdit", "", "chapterId", "chapterName", "collect", "courseId", "desc", "descMd", "envelopePic", "fresh", "host", "id", "link", "niceDate", "niceShareDate", "origin", "prefix", "projectLink", "publishTime", "", "realSuperChapterId", "selfVisible", "shareDate", "shareUser", "superChapterId", "superChapterName", "tags", "", "Lcom/fuusy/project/bean/Tag;", "title", "type", "userId", "visible", "zan", "(Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;IIII)V", "getApkLink", "()Ljava/lang/String;", "getAudit", "()I", "getAuthor", "getCanEdit", "()Z", "getChapterId", "getChapterName", "getCollect", "getCourseId", "getDesc", "getDescMd", "getEnvelopePic", "getFresh", "getHost", "getId", "getLink", "getNiceDate", "getNiceShareDate", "getOrigin", "getPrefix", "getProjectLink", "getPublishTime", "()J", "getRealSuperChapterId", "getSelfVisible", "getShareDate", "getShareUser", "getSuperChapterId", "getSuperChapterName", "getTags", "()Ljava/util/List;", "getTitle", "getType", "getUserId", "getVisible", "getZan", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "project_debug"})
public final class ProjectContent {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apkLink = null;
    private final int audit = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String author = null;
    private final boolean canEdit = false;
    private final int chapterId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String chapterName = null;
    private final boolean collect = false;
    private final int courseId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String desc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String descMd = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String envelopePic = null;
    private final boolean fresh = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String host = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String link = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String niceDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String niceShareDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String origin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prefix = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String projectLink = null;
    private final long publishTime = 0L;
    private final int realSuperChapterId = 0;
    private final int selfVisible = 0;
    private final long shareDate = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shareUser = null;
    private final int superChapterId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String superChapterName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.fuusy.project.bean.Tag> tags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int type = 0;
    private final int userId = 0;
    private final int visible = 0;
    private final int zan = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApkLink() {
        return null;
    }
    
    public final int getAudit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthor() {
        return null;
    }
    
    public final boolean getCanEdit() {
        return false;
    }
    
    public final int getChapterId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChapterName() {
        return null;
    }
    
    public final boolean getCollect() {
        return false;
    }
    
    public final int getCourseId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescMd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnvelopePic() {
        return null;
    }
    
    public final boolean getFresh() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNiceDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNiceShareDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrigin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProjectLink() {
        return null;
    }
    
    public final long getPublishTime() {
        return 0L;
    }
    
    public final int getRealSuperChapterId() {
        return 0;
    }
    
    public final int getSelfVisible() {
        return 0;
    }
    
    public final long getShareDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShareUser() {
        return null;
    }
    
    public final int getSuperChapterId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuperChapterName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fuusy.project.bean.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final int getVisible() {
        return 0;
    }
    
    public final int getZan() {
        return 0;
    }
    
    public ProjectContent(@org.jetbrains.annotations.NotNull()
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull()
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull()
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull()
    java.lang.String desc, @org.jetbrains.annotations.NotNull()
    java.lang.String descMd, @org.jetbrains.annotations.NotNull()
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull()
    java.lang.String host, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.NotNull()
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull()
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull()
    java.lang.String origin, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull()
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull()
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fuusy.project.bean.Tag> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int type, int userId, int visible, int zan) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    public final long component21() {
        return 0L;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final long component24() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    public final int component26() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fuusy.project.bean.Tag> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    public final int component30() {
        return 0;
    }
    
    public final int component31() {
        return 0;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int component33() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fuusy.project.bean.ProjectContent copy(@org.jetbrains.annotations.NotNull()
    java.lang.String apkLink, int audit, @org.jetbrains.annotations.NotNull()
    java.lang.String author, boolean canEdit, int chapterId, @org.jetbrains.annotations.NotNull()
    java.lang.String chapterName, boolean collect, int courseId, @org.jetbrains.annotations.NotNull()
    java.lang.String desc, @org.jetbrains.annotations.NotNull()
    java.lang.String descMd, @org.jetbrains.annotations.NotNull()
    java.lang.String envelopePic, boolean fresh, @org.jetbrains.annotations.NotNull()
    java.lang.String host, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.NotNull()
    java.lang.String niceDate, @org.jetbrains.annotations.NotNull()
    java.lang.String niceShareDate, @org.jetbrains.annotations.NotNull()
    java.lang.String origin, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String projectLink, long publishTime, int realSuperChapterId, int selfVisible, long shareDate, @org.jetbrains.annotations.NotNull()
    java.lang.String shareUser, int superChapterId, @org.jetbrains.annotations.NotNull()
    java.lang.String superChapterName, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fuusy.project.bean.Tag> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int type, int userId, int visible, int zan) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
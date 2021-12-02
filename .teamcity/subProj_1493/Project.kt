package subProj_1493

import subProj_1493.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1493")
    name = "subProj 1493"

    buildType(subProj_bt_1493_4)
    buildType(subProj_bt_1493_3)
    buildType(subProj_bt_1493_2)
    buildType(subProj_bt_1493_1)
    buildType(subProj_bt_1493_0)
    buildType(subProj_bt_1493_5)
})

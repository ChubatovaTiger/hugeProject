package subProj_718

import subProj_718.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_718")
    name = "subProj 718"

    buildType(subProj_bt_718_1)
    buildType(subProj_bt_718_0)
    buildType(subProj_bt_718_5)
    buildType(subProj_bt_718_4)
    buildType(subProj_bt_718_3)
    buildType(subProj_bt_718_2)
})

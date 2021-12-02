package subProj_126

import subProj_126.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_126")
    name = "subProj 126"

    buildType(subProj_bt_126_5)
    buildType(subProj_bt_126_4)
    buildType(subProj_bt_126_3)
    buildType(subProj_bt_126_2)
    buildType(subProj_bt_126_1)
    buildType(subProj_bt_126_0)
})

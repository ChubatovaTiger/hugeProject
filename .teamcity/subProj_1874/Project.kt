package subProj_1874

import subProj_1874.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1874")
    name = "subProj 1874"

    buildType(subProj_bt_1874_4)
    buildType(subProj_bt_1874_5)
    buildType(subProj_bt_1874_2)
    buildType(subProj_bt_1874_3)
    buildType(subProj_bt_1874_0)
    buildType(subProj_bt_1874_1)
})

package subProj_1104

import subProj_1104.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1104")
    name = "subProj 1104"

    buildType(subProj_bt_1104_1)
    buildType(subProj_bt_1104_0)
    buildType(subProj_bt_1104_3)
    buildType(subProj_bt_1104_2)
    buildType(subProj_bt_1104_5)
    buildType(subProj_bt_1104_4)
})

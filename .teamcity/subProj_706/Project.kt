package subProj_706

import subProj_706.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_706")
    name = "subProj 706"

    buildType(subProj_bt_706_1)
    buildType(subProj_bt_706_2)
    buildType(subProj_bt_706_0)
    buildType(subProj_bt_706_5)
    buildType(subProj_bt_706_3)
    buildType(subProj_bt_706_4)
})

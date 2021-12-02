package subProj_1399

import subProj_1399.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1399")
    name = "subProj 1399"

    buildType(subProj_bt_1399_1)
    buildType(subProj_bt_1399_0)
    buildType(subProj_bt_1399_3)
    buildType(subProj_bt_1399_2)
    buildType(subProj_bt_1399_5)
    buildType(subProj_bt_1399_4)
})

package subProj_1538

import subProj_1538.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1538")
    name = "subProj 1538"

    buildType(subProj_bt_1538_3)
    buildType(subProj_bt_1538_4)
    buildType(subProj_bt_1538_1)
    buildType(subProj_bt_1538_2)
    buildType(subProj_bt_1538_5)
    buildType(subProj_bt_1538_0)
})

package subProj_1456

import subProj_1456.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1456")
    name = "subProj 1456"

    buildType(subProj_bt_1456_3)
    buildType(subProj_bt_1456_2)
    buildType(subProj_bt_1456_5)
    buildType(subProj_bt_1456_4)
    buildType(subProj_bt_1456_1)
    buildType(subProj_bt_1456_0)
})

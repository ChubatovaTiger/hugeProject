package subProj_1517

import subProj_1517.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1517")
    name = "subProj 1517"

    buildType(subProj_bt_1517_1)
    buildType(subProj_bt_1517_0)
    buildType(subProj_bt_1517_3)
    buildType(subProj_bt_1517_2)
    buildType(subProj_bt_1517_5)
    buildType(subProj_bt_1517_4)
})

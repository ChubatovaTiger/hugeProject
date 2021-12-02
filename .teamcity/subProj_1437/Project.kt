package subProj_1437

import subProj_1437.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1437")
    name = "subProj 1437"

    buildType(subProj_bt_1437_3)
    buildType(subProj_bt_1437_4)
    buildType(subProj_bt_1437_5)
    buildType(subProj_bt_1437_0)
    buildType(subProj_bt_1437_1)
    buildType(subProj_bt_1437_2)
})

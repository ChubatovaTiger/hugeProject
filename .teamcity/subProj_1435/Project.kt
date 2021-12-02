package subProj_1435

import subProj_1435.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1435")
    name = "subProj 1435"

    buildType(subProj_bt_1435_5)
    buildType(subProj_bt_1435_1)
    buildType(subProj_bt_1435_2)
    buildType(subProj_bt_1435_3)
    buildType(subProj_bt_1435_4)
    buildType(subProj_bt_1435_0)
})

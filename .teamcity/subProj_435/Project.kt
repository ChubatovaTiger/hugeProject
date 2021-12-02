package subProj_435

import subProj_435.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_435")
    name = "subProj 435"

    buildType(subProj_bt_435_1)
    buildType(subProj_bt_435_0)
    buildType(subProj_bt_435_3)
    buildType(subProj_bt_435_2)
    buildType(subProj_bt_435_5)
    buildType(subProj_bt_435_4)
})

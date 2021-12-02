package subProj_456

import subProj_456.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_456")
    name = "subProj 456"

    buildType(subProj_bt_456_1)
    buildType(subProj_bt_456_2)
    buildType(subProj_bt_456_0)
    buildType(subProj_bt_456_5)
    buildType(subProj_bt_456_3)
    buildType(subProj_bt_456_4)
})

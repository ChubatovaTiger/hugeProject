package subProj_1496

import subProj_1496.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1496")
    name = "subProj 1496"

    buildType(subProj_bt_1496_1)
    buildType(subProj_bt_1496_0)
    buildType(subProj_bt_1496_5)
    buildType(subProj_bt_1496_4)
    buildType(subProj_bt_1496_3)
    buildType(subProj_bt_1496_2)
})

package subProj_1767

import subProj_1767.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1767")
    name = "subProj 1767"

    buildType(subProj_bt_1767_3)
    buildType(subProj_bt_1767_4)
    buildType(subProj_bt_1767_5)
    buildType(subProj_bt_1767_0)
    buildType(subProj_bt_1767_1)
    buildType(subProj_bt_1767_2)
})

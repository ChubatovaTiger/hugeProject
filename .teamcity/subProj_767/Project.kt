package subProj_767

import subProj_767.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_767")
    name = "subProj 767"

    buildType(subProj_bt_767_5)
    buildType(subProj_bt_767_4)
    buildType(subProj_bt_767_1)
    buildType(subProj_bt_767_0)
    buildType(subProj_bt_767_3)
    buildType(subProj_bt_767_2)
})

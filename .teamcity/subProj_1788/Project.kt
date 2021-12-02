package subProj_1788

import subProj_1788.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1788")
    name = "subProj 1788"

    buildType(subProj_bt_1788_5)
    buildType(subProj_bt_1788_4)
    buildType(subProj_bt_1788_1)
    buildType(subProj_bt_1788_0)
    buildType(subProj_bt_1788_3)
    buildType(subProj_bt_1788_2)
})

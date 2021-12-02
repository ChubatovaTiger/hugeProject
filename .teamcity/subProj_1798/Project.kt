package subProj_1798

import subProj_1798.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1798")
    name = "subProj 1798"

    buildType(subProj_bt_1798_5)
    buildType(subProj_bt_1798_0)
    buildType(subProj_bt_1798_2)
    buildType(subProj_bt_1798_1)
    buildType(subProj_bt_1798_4)
    buildType(subProj_bt_1798_3)
})

package subProj_1822

import subProj_1822.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1822")
    name = "subProj 1822"

    buildType(subProj_bt_1822_0)
    buildType(subProj_bt_1822_1)
    buildType(subProj_bt_1822_2)
    buildType(subProj_bt_1822_3)
    buildType(subProj_bt_1822_4)
    buildType(subProj_bt_1822_5)
})

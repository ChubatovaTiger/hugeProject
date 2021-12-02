package subProj_1928

import subProj_1928.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1928")
    name = "subProj 1928"

    buildType(subProj_bt_1928_4)
    buildType(subProj_bt_1928_5)
    buildType(subProj_bt_1928_2)
    buildType(subProj_bt_1928_3)
    buildType(subProj_bt_1928_0)
    buildType(subProj_bt_1928_1)
})

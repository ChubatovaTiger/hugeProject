package subProj_1828

import subProj_1828.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1828")
    name = "subProj 1828"

    buildType(subProj_bt_1828_5)
    buildType(subProj_bt_1828_1)
    buildType(subProj_bt_1828_2)
    buildType(subProj_bt_1828_3)
    buildType(subProj_bt_1828_4)
    buildType(subProj_bt_1828_0)
})

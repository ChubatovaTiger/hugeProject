package subProj_1367

import subProj_1367.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1367")
    name = "subProj 1367"

    buildType(subProj_bt_1367_5)
    buildType(subProj_bt_1367_4)
    buildType(subProj_bt_1367_3)
    buildType(subProj_bt_1367_2)
    buildType(subProj_bt_1367_1)
    buildType(subProj_bt_1367_0)
})

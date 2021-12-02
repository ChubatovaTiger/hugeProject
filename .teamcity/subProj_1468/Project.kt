package subProj_1468

import subProj_1468.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1468")
    name = "subProj 1468"

    buildType(subProj_bt_1468_5)
    buildType(subProj_bt_1468_3)
    buildType(subProj_bt_1468_4)
    buildType(subProj_bt_1468_1)
    buildType(subProj_bt_1468_2)
    buildType(subProj_bt_1468_0)
})

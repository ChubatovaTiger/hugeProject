package subProj_1382

import subProj_1382.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1382")
    name = "subProj 1382"

    buildType(subProj_bt_1382_0)
    buildType(subProj_bt_1382_1)
    buildType(subProj_bt_1382_2)
    buildType(subProj_bt_1382_3)
    buildType(subProj_bt_1382_4)
    buildType(subProj_bt_1382_5)
})

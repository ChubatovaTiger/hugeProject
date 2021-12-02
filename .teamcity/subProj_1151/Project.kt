package subProj_1151

import subProj_1151.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1151")
    name = "subProj 1151"

    buildType(subProj_bt_1151_1)
    buildType(subProj_bt_1151_0)
    buildType(subProj_bt_1151_5)
    buildType(subProj_bt_1151_4)
    buildType(subProj_bt_1151_3)
    buildType(subProj_bt_1151_2)
})

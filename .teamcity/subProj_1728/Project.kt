package subProj_1728

import subProj_1728.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1728")
    name = "subProj 1728"

    buildType(subProj_bt_1728_4)
    buildType(subProj_bt_1728_5)
    buildType(subProj_bt_1728_2)
    buildType(subProj_bt_1728_3)
    buildType(subProj_bt_1728_0)
    buildType(subProj_bt_1728_1)
})

package subProj_1560

import subProj_1560.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1560")
    name = "subProj 1560"

    buildType(subProj_bt_1560_0)
    buildType(subProj_bt_1560_1)
    buildType(subProj_bt_1560_2)
    buildType(subProj_bt_1560_3)
    buildType(subProj_bt_1560_4)
    buildType(subProj_bt_1560_5)
})

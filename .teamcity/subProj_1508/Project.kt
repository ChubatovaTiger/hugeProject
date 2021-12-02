package subProj_1508

import subProj_1508.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1508")
    name = "subProj 1508"

    buildType(subProj_bt_1508_1)
    buildType(subProj_bt_1508_0)
    buildType(subProj_bt_1508_3)
    buildType(subProj_bt_1508_2)
    buildType(subProj_bt_1508_5)
    buildType(subProj_bt_1508_4)
})

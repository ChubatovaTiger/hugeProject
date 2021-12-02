package subProj_1663

import subProj_1663.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1663")
    name = "subProj 1663"

    buildType(subProj_bt_1663_2)
    buildType(subProj_bt_1663_3)
    buildType(subProj_bt_1663_0)
    buildType(subProj_bt_1663_1)
    buildType(subProj_bt_1663_4)
    buildType(subProj_bt_1663_5)
})

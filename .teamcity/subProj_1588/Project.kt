package subProj_1588

import subProj_1588.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1588")
    name = "subProj 1588"

    buildType(subProj_bt_1588_3)
    buildType(subProj_bt_1588_2)
    buildType(subProj_bt_1588_5)
    buildType(subProj_bt_1588_4)
    buildType(subProj_bt_1588_1)
    buildType(subProj_bt_1588_0)
})

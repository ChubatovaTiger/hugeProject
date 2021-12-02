package subProj_1100

import subProj_1100.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1100")
    name = "subProj 1100"

    buildType(subProj_bt_1100_2)
    buildType(subProj_bt_1100_3)
    buildType(subProj_bt_1100_4)
    buildType(subProj_bt_1100_5)
    buildType(subProj_bt_1100_0)
    buildType(subProj_bt_1100_1)
})

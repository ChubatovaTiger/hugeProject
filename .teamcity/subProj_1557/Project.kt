package subProj_1557

import subProj_1557.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1557")
    name = "subProj 1557"

    buildType(subProj_bt_1557_5)
    buildType(subProj_bt_1557_4)
    buildType(subProj_bt_1557_3)
    buildType(subProj_bt_1557_2)
    buildType(subProj_bt_1557_1)
    buildType(subProj_bt_1557_0)
})

package subProj_1434

import subProj_1434.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1434")
    name = "subProj 1434"

    buildType(subProj_bt_1434_2)
    buildType(subProj_bt_1434_3)
    buildType(subProj_bt_1434_4)
    buildType(subProj_bt_1434_5)
    buildType(subProj_bt_1434_0)
    buildType(subProj_bt_1434_1)
})

package subProj_1426

import subProj_1426.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1426")
    name = "subProj 1426"

    buildType(subProj_bt_1426_3)
    buildType(subProj_bt_1426_4)
    buildType(subProj_bt_1426_5)
    buildType(subProj_bt_1426_0)
    buildType(subProj_bt_1426_1)
    buildType(subProj_bt_1426_2)
})

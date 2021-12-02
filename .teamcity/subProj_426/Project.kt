package subProj_426

import subProj_426.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_426")
    name = "subProj 426"

    buildType(subProj_bt_426_1)
    buildType(subProj_bt_426_0)
    buildType(subProj_bt_426_3)
    buildType(subProj_bt_426_2)
    buildType(subProj_bt_426_5)
    buildType(subProj_bt_426_4)
})

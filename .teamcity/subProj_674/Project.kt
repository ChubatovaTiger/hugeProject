package subProj_674

import subProj_674.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_674")
    name = "subProj 674"

    buildType(subProj_bt_674_0)
    buildType(subProj_bt_674_5)
    buildType(subProj_bt_674_4)
    buildType(subProj_bt_674_3)
    buildType(subProj_bt_674_2)
    buildType(subProj_bt_674_1)
})

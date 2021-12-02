package subProj_877

import subProj_877.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_877")
    name = "subProj 877"

    buildType(subProj_bt_877_5)
    buildType(subProj_bt_877_4)
    buildType(subProj_bt_877_3)
    buildType(subProj_bt_877_2)
    buildType(subProj_bt_877_1)
    buildType(subProj_bt_877_0)
})

package subProj_994

import subProj_994.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_994")
    name = "subProj 994"

    buildType(subProj_bt_994_2)
    buildType(subProj_bt_994_3)
    buildType(subProj_bt_994_0)
    buildType(subProj_bt_994_1)
    buildType(subProj_bt_994_4)
    buildType(subProj_bt_994_5)
})

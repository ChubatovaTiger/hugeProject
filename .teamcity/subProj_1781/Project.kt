package subProj_1781

import subProj_1781.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1781")
    name = "subProj 1781"

    buildType(subProj_bt_1781_0)
    buildType(subProj_bt_1781_2)
    buildType(subProj_bt_1781_1)
    buildType(subProj_bt_1781_4)
    buildType(subProj_bt_1781_3)
    buildType(subProj_bt_1781_5)
})

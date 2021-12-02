package subProj_1645

import subProj_1645.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1645")
    name = "subProj 1645"

    buildType(subProj_bt_1645_5)
    buildType(subProj_bt_1645_4)
    buildType(subProj_bt_1645_1)
    buildType(subProj_bt_1645_0)
    buildType(subProj_bt_1645_3)
    buildType(subProj_bt_1645_2)
})

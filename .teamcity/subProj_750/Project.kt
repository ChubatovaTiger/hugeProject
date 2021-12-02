package subProj_750

import subProj_750.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_750")
    name = "subProj 750"

    buildType(subProj_bt_750_0)
    buildType(subProj_bt_750_1)
    buildType(subProj_bt_750_2)
    buildType(subProj_bt_750_3)
    buildType(subProj_bt_750_4)
    buildType(subProj_bt_750_5)
})

package subProj_1750

import subProj_1750.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1750")
    name = "subProj 1750"

    buildType(subProj_bt_1750_5)
    buildType(subProj_bt_1750_4)
    buildType(subProj_bt_1750_3)
    buildType(subProj_bt_1750_2)
    buildType(subProj_bt_1750_1)
    buildType(subProj_bt_1750_0)
})

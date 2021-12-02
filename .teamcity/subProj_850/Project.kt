package subProj_850

import subProj_850.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_850")
    name = "subProj 850"

    buildType(subProj_bt_850_0)
    buildType(subProj_bt_850_3)
    buildType(subProj_bt_850_4)
    buildType(subProj_bt_850_1)
    buildType(subProj_bt_850_2)
    buildType(subProj_bt_850_5)
})

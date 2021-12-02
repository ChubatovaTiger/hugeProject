package subProj_1589

import subProj_1589.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1589")
    name = "subProj 1589"

    buildType(subProj_bt_1589_5)
    buildType(subProj_bt_1589_2)
    buildType(subProj_bt_1589_1)
    buildType(subProj_bt_1589_4)
    buildType(subProj_bt_1589_3)
    buildType(subProj_bt_1589_0)
})

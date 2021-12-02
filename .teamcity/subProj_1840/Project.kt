package subProj_1840

import subProj_1840.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1840")
    name = "subProj 1840"

    buildType(subProj_bt_1840_4)
    buildType(subProj_bt_1840_3)
    buildType(subProj_bt_1840_5)
    buildType(subProj_bt_1840_0)
    buildType(subProj_bt_1840_2)
    buildType(subProj_bt_1840_1)
})

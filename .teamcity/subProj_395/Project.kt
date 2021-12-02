package subProj_395

import subProj_395.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_395")
    name = "subProj 395"

    buildType(subProj_bt_395_5)
    buildType(subProj_bt_395_3)
    buildType(subProj_bt_395_4)
    buildType(subProj_bt_395_1)
    buildType(subProj_bt_395_2)
    buildType(subProj_bt_395_0)
})

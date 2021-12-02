package subProj_535

import subProj_535.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_535")
    name = "subProj 535"

    buildType(subProj_bt_535_5)
    buildType(subProj_bt_535_4)
    buildType(subProj_bt_535_3)
    buildType(subProj_bt_535_2)
    buildType(subProj_bt_535_1)
    buildType(subProj_bt_535_0)
})

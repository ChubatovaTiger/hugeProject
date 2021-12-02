package subProj_1535

import subProj_1535.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1535")
    name = "subProj 1535"

    buildType(subProj_bt_1535_4)
    buildType(subProj_bt_1535_5)
    buildType(subProj_bt_1535_2)
    buildType(subProj_bt_1535_3)
    buildType(subProj_bt_1535_0)
    buildType(subProj_bt_1535_1)
})

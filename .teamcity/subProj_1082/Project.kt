package subProj_1082

import subProj_1082.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1082")
    name = "subProj 1082"

    buildType(subProj_bt_1082_0)
    buildType(subProj_bt_1082_5)
    buildType(subProj_bt_1082_3)
    buildType(subProj_bt_1082_4)
    buildType(subProj_bt_1082_1)
    buildType(subProj_bt_1082_2)
})

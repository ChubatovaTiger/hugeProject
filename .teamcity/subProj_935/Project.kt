package subProj_935

import subProj_935.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_935")
    name = "subProj 935"

    buildType(subProj_bt_935_1)
    buildType(subProj_bt_935_2)
    buildType(subProj_bt_935_3)
    buildType(subProj_bt_935_4)
    buildType(subProj_bt_935_5)
    buildType(subProj_bt_935_0)
})

package subProj_598

import subProj_598.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_598")
    name = "subProj 598"

    buildType(subProj_bt_598_2)
    buildType(subProj_bt_598_3)
    buildType(subProj_bt_598_0)
    buildType(subProj_bt_598_1)
    buildType(subProj_bt_598_4)
    buildType(subProj_bt_598_5)
})
